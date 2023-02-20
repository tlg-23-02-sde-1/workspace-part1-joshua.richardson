/**
 *  This module is the "client" medule, and it contains this package:
 *  com.entertainment.client
 *
 *  As the "client" module, it does not export anything.
 *  BUT it does need to declare a dependaency on module com.entertainment
 */

module com.entertainment.client {
    requires com.entertainment;
}