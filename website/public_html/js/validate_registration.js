/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


function validatePasswords() {
    var pass1 = document.getElementById("password1").value;
    var pass2 = document.getElementById("password2").value;
    var submit = document.getElementById("form_submit");
    if(pass1 == pass2)
        submit.disabled = false;
    else
        submit.disabled = true;
   
}

