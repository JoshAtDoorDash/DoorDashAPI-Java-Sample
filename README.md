# DoorDash API Java Sample

This sample is an example of how to create a JWT using Java when calling the DoorDash API.

It builds a token that is valid for 30 minutes. Please obtain a set of DoorDash Credentials (Developer ID, Key ID, and Signing Secret) in the [DoorDash Developer Portal](https://developer.doordash.com/portal/integration/drive/credentials) to use in the application.

This application was built using [Amazon Corretto 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html) JDK and [Gradle 7.5.1](https://gradle.org/install/). The code source and build files provided in this repository are samples and not intended for production, and are not supported. 

This sample uses an [IntelliJ IDEA](https://www.jetbrains.com/idea/) project. You may use different IDE, but this sample is configured for IntelliJ IDEA. If using a different IDE, the source you'll want to copy is in TODO.

## Running Sample

Follow these steps to run the sample app:

1. Clone repository locally.
2. Open the project located in the ```source/DoorDashAPIJavaSample``` folder with [IntelliJ IDEA](https://www.jetbrains.com/idea/).
3. Open the ```DoorDash.java``` file (located in ```source/DoorDashAPIJavaSample/src/main/java/org/example/doordash/```) in your editor and resolve all TODO items listed in comments, save changes.
4. Build and run the application.

## More About DoorDash Credentials

- [DoorDash JWT Format](https://developer.doordash.com/en-US/docs/drive/reference/JWTs/)
- [Manage DoorDash Credentials](https://developer.doordash.com/en-US/docs/drive/how_to/manage_credentials/)
- [Create DoorDash JSON Web Tokens (JWTs)](https://developer.doordash.com/en-US/docs/drive/how_to/JWTs)

## Related Utilities and Samples

- [auth0 JWT Debugger](https://jwt.io/)
- [DoorDash API JWT JSFiddle Sample](https://bit.ly/doordashapi)
- [make-doordash-jwt CLI](https://github.com/infin8x/make-doordash-jwt)
- [DoorDash API get started with Postman](https://developer.doordash.com/en-US/docs/drive/tutorials/get_started_postman/)
- [DoorDash SDK Example Application](https://github.com/doordash-oss/doordash_sdk_example_application)

## Community

Please join the [DoorDash Developer Discord community](https://discord.com/channels/951208871828013066/951208872478113875) to provide feedback and ask questions about developing with the DoorDash API.
