# Gerência de inventário

Simple desktop multi-platform JavaFX inventory management application.

## MIT LICENCE

https://opensource.org/licenses/MIT

Totaly free to use, modify, sell, etc.

## FEATURES

- Dashboard/stats
- Manage products
- Manage product groups
- Manage product group variants
- Manage orders
- Sell and buy type of order
- Stock preview

## SCREENSHOTS

See here: https://drive.google.com/drive/folders/0BxIbA3Gdn5AQa1ZMa2FHTlRPRms

## INSTALL

### REQUIREMENTS

- Maven
- Java 1.8 (not tested in older versions yet)

### DOWNLOAD, COMPILE AND RUN (using Maven)

```
git clone [this repo URL]
cd [cloned-dir]
mvn compile
mvn exec:java
```
### LOGIN

The credentials for login are defined in users table in the SQL file placed in the root directory.
By default use following:

```
username: b
pass: b
```