Questions
=========

What do we need Google Authentication to do?
============================================
  -Relieve us of having to create and store user accounts.
  -Allow access to a user's SMS data on Android Device.
  
How do we store data on the Web Client?
=======================================
  -We can't without serious work on the server side.
  -We can allow the web client to access all SMS data on the phone.
  
How can we store data on the other clients?
===========================================
  -Locally, though this presents some security issues.
  
How do the clients know to update?
==================================
  -An SMS event on a mobile device will trigger a signal, send it to the server,
   and tell the clients to update.
