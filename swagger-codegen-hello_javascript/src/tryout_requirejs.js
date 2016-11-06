(function(root, factory) {
  if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory( require('../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.SampleRestApplication);
  }
}(this, function(SampleRestApplication) {
  'use strict';

  var instance = new SampleRestApplication.HelloApi();
  
  instance.apiClient.basePath = 'http://localhost:8080/services/services';
  instance.sayHelloWithModel('test', function(error, data, response) {
	  console.log('response ' + data.name);
	  console.log('response ' + data.greeting);
  })

}));
