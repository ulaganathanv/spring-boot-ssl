# SSL configuration on spring boot application with self signed certificate

SSL – (Secure Sockets Layer) is the standard security technology for establishing an encrypted link between a web server and a browser. This link ensures that all data passed between the web server and browsers remain private and integral.

Self signed certificate – is an identity certificate that is signed by the same entity whose identity it certifies.

Keystore and Truststore – is used to store SSL certificates in Java but there is subtle difference between them. truststore is used to store public certificates while keystore is used to store private certificates of client or server.

### Create Java Key Store with Certificate
$ keytool -genkey -keyalg RSA -alias selfsigned -keystore keystore.jks -storepass abc123 -validity 360 -keysize 2018

### List out the details of the given keystore
$ keytool -v -list keystore keystore.jks

### Export self-signed certificate to distribute to the clients
$ keytool -exportcert -rfc -alias selfsigned -keystore keystore.jks -file selfsigned.crt

### Verify the certificate
$ keytool -printcert -file selfsigned.crt
