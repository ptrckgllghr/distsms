/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

function getRequest() {
if (window.XMLHttpRequest)
  return new XMLHttpRequest();
else
  return new ActiveXObject("Microsoft.XMLHTTP");
}

/**
 * 
 * @param XMLHttpRequest request
 * @param object callback
 */
function setCallback(request, callback) {
    request.onreadystatechange = callback;
}

function get(request, url) {
    request.open(GET,url,true);
    request.send();
}