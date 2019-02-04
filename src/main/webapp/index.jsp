<html>
<head>
<Title>Hello App</Title>
<script src="./libs/jquery-1.9.1.js"></script>


<script type="text/javascript">
// Below code added to introduce a true vulnerability
function CallCrossDomain() {
    var dataToSend = { "": 200 };
    $.ajax({
        url: "http://someOutsideDomain/Service1.svc/getDiscountonPriceSlab",
        data: 'inPrice=200',
        type: "GET",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        processdata: true,
        success: function (outmsg) {
           // alert("success");
            var arr = $.map(outmsg, function (el) { return el; });
           // alert('success :' + arr);
        },
        error: function (msg) {
            //alert('failure');
           
            
        }
    });
}

// Below ajax is a false issue
function CallInternal() {
    var dataToSend = { "": 200 };
    $.ajax({
        url: "/Service1/getDiscountonPriceSlab",
        data: 'inPrice=200',
        type: "GET",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        processdata: true,
        success: function (outmsg) {
           // alert("success");
            var arr = $.map(outmsg, function (el) { return el; });
           // alert('success :' + arr);
        },
        error: function (msg) {
            //alert('failure');
           
            
        }
    });
}
</script>
</head>

<body>

	<h2>Hello World!</h2> <br>
	<input type="button" name="btn" value="Cross Domain Call" onclick="javascript:CallCrossDomain()"></input><br>
	<!-- Below is a false issue -->
	<input name="password" type="password">
	
	<!-- Below is a true issue -->
	<input name="password" type="password" value="Qwertypoi" readonly="readonly">

<h1>Below lines come from included jsp</h1>
<jsp:include page="common.jsp" />  
	<h1>Hello FLUX!</h1>
</body>
</html>
