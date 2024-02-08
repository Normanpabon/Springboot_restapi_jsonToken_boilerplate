# noinspection SqlNoDataSourceInspectionForFile
DROP DATABASE RestAPIBoilerPlate;
DROP USER 'ManagerDBAdmin';

CREATE DATABASE RestAPIBoilerPlate;

use RestAPIBoilerPlate;

CREATE USER 'ManagerDBAdmin' IDENTIFIED BY '#$#@#Admin#$#$';

GRANT ALL PRIVILEGES ON RestAPIBoilerPlate.* to 'ManagerDBAdmin';

