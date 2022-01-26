function validateForm(){
    var form = document.simpleform;
    var name = form.un;
    var pw = form.pw;

    if(name.value.length < 1){
        alert('User name can not be empty');
        return false;
    }

    if(pw.value.length < 1){
        alert('Password can not be empty');
        return false;
    }
}