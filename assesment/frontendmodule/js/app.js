function compile() {

	var html = document.getElementById("html");
	var css = document.getElementById("css");
    var js = document.getElementById("js");
    /* storing window object given by iframe in variable "code" */
	var code = document.getElementById("code").contentWindow.document;
	/*  by using 'onkeyup' event we are calling a function() for displaying the result when we release key */
	 document.body.onkeyup = function(){
       /*   if we use open() with no URL, a new window/tab with about:blank is opened to write our code */
        code.open();
       /*  writeln() add a new line after each statement
       Here, we are adding first html code into the editor window, then linking css code using "style" tag and then linking javaScript code using "script" tag*/>
        code.writeln(html.value+"<style>"+css.value+"</style>"+"<script>" + js.value + "</script>");
       /*  closing the window opened by using open() */
		code.close();
      };
    };
/* method getting called whenever we release the key */
compile();