package at.fwd.swagger.custom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.codegen.CliOption;
import io.swagger.codegen.SupportingFile;
import io.swagger.codegen.languages.JavaCXFServerCodegen;

public class JaxrsCxfServerCustomCodegen extends JavaCXFServerCodegen implements CXFServerJbossEap6Feature {

    private static final Logger LOGGER = LoggerFactory.getLogger(JaxrsCxfServerCustomCodegen.class);

    protected boolean useJbossEap6DeploymentStructure = false;

    public JaxrsCxfServerCustomCodegen() {
        super();

        cliOptions.add(
                CliOption.newBoolean(USE_JBOSS_EAP6_DEPLOYMENT_STRUCTURE, "Use Jboss EAP 6 Deployment Structure file"));

    }

    @Override
	public void processOpts() {
		super.processOpts();

        if (additionalProperties.containsKey(USE_JBOSS_EAP6_DEPLOYMENT_STRUCTURE)) {
            LOGGER.info("*** activating Support for Jboss EAP 6");
            boolean useJbossEapDeploymentStructureProp = convertPropertyToBooleanAndWriteBack(
                    USE_JBOSS_EAP6_DEPLOYMENT_STRUCTURE);
            this.setUseJbossEap6DeploymentStructure(useJbossEapDeploymentStructureProp);
        }

        if (useJbossEap6DeploymentStructure) {
            // Jboss EAP 6 Support
            writeOptional(outputFolder, new SupportingFile("server/jboss-deployment-structure.xml.mustache",
                    ("src/main/webapp/WEB-INF"), "jboss-deployment-structure.xml"));

        }
	}

	@Override
	public String getName() {
		return "jaxrs-cxf-custom";
	}

    public void setUseJbossEap6DeploymentStructure(boolean useJbossEap6DeploymentStructure) {
        this.useJbossEap6DeploymentStructure = useJbossEap6DeploymentStructure;
    }

}
