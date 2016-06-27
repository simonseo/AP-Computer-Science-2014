function FP_preloadImgs() {//v1.0
 var d=document,a=arguments; if(!d.FP_imgs) d.FP_imgs=new Array();
 for(var i=0; i<a.length; i++) { d.FP_imgs[i]=new Image; d.FP_imgs[i].src=a[i]; }
}

function FP_swapImg() {//v1.0
 var doc=document,args=arguments,elm,n; doc.$imgSwaps=new Array(); for(n=2; n<args.length;
 n+=2) { elm=FP_getObjectByID(args[n]); if(elm) { doc.$imgSwaps[doc.$imgSwaps.length]=elm;
 elm.$src=elm.src; elm.src=args[n+1]; } }
}

function FP_getObjectByID(id,o) {//v1.0
 var c,el,els,f,m,n; if(!o)o=document; if(o.getElementById) el=o.getElementById(id);
 else if(o.layers) c=o.layers; else if(o.all) el=o.all[id]; if(el) return el;
 if(o.id==id || o.name==id) return o; if(o.childNodes) c=o.childNodes; if(c)
 for(n=0; n<c.length; n++) { el=FP_getObjectByID(id,c[n]); if(el) return el; }
 f=o.forms; if(f) for(n=0; n<f.length; n++) { els=f[n].elements;
 for(m=0; m<els.length; m++){ el=FP_getObjectByID(id,els[n]); if(el) return el; } }
 return null;
}

function score() {
	var correct = 0, i, j, ans, answered = 0;
	var Q = "cdceebbaca" + "bdbdedacca" + "bbece" + 
			"ebccaaddcd" + "eecbdcdbeb" + "caaba" +
			"dcbeebdcca" + "dcccdadbee" + "adabb" + 
			"bacdcddeab" + "ebebecadac" + "dcebe" + 
			"eceabbdacd" + "baceecabae" + "dcdba" + 
			"cabcadceec" + "cdbcbedeaa" + "bbead" +
			"aecbabdcab" + "caedacddcb" + "edeab";

	for (i = 1; i < Q.length; i++) {
		ans = ""
		if (  eval("test.q" + i + "[0].checked") ) { ans = "a"; answered++; }
		if (  eval("test.q" + i + "[1].checked") ) { ans = "b"; answered++; }
		if (  eval("test.q" + i + "[2].checked") ) { ans = "c"; answered++; }
		if (  eval("test.q" + i + "[3].checked") ) { ans = "d"; answered++; }
		if (  eval("test.q" + i + "[4].checked") ) { ans = "e"; answered++; }
		if (ans == "") continue;
		
		if (Q.charAt(i - 1) == ans) {
			correct++;
			document.getElementById(i + "_div").style.visibility = "visible";
			document.getElementById(i + "_img").src = "pics/right.gif";
		} else {
			document.getElementById(i + "_div").style.visibility = "visible";
			document.getElementById(i + "_img").src = "pics/wrong.gif";
		}
	}
	document.getElementById("results").innerHTML = "<h1>You correctly answered " + correct + " questions (" + (100 * correct)/answered + "%)</h1>"
}