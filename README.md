DistSMS
=======

	-The Goal of DistSMS is to provide web, desktop, and mobile clients for the access of personal 
		SMS data.
	-The user will access these clients using their Google Account, making the initial project specific 
		to Android devices.
	-An SMS event on a mobile device will trigger a event which will then be relayed through a server and 
		to each of the clients.
	-The clients will provide an interface to view SMS and also archive the information.

Web Client
==========

	 -A new session begun after a user passes Google Authentication.
	 -At the time of a new authentication all *new* SMS data is requested by the web client.
		-Since personal storage is unlikely in the web client, any access to SMS Archive will
		 be done through request, or this feature will be unavailable in the WebApp.
	 -The user should have the ability to read or manipulate SMS data, including READ, SEND, DELETE.
	 -The Web Client should use a combination of Java, Struts, Hibernate, HTML, Tag Libraries, XML,
		and preferably AJAX.

Mobile Client
=============
	
	 -A new session begun after a user downloads the application from the Google Play Store and/or 
	 	accesses the application using Google Authentication.
	 -At the time of a new authentication all *new* SMS data is requested by the web client.
	 -Archiving is optional, but SMS data may be saved and stored locally on the Android device.
	 -The user should have the ability to read or manipulate SMS data, including READ, SEND, 
	 	DELETE, and SAVE

Desktop Client
==============

	-Authentication will relay to the Google Authentication of the web client to grant access to the 
		user's SMS data.
	-The user should have the ability to read or manipulate SMS data, including READ, SEND, 
		DELETE, and SAVE.
