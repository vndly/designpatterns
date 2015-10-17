Front Controller Pattern
========================

The front controller pattern is a design pattern which provides a centralized request handling mechanism so that all requests will be handled by a single handler. This handler can do the authentication/authorization/logging or tracking of request and then pass the requests to corresponding handlers. The pattern is usually composed of:

* Front Controller: single handler for all kind of request coming to the application

* Dispatcher: front controller may use a dispatcher object which can dispatch the request to corresponding specific handler

* View: views are the object for which the requests are made