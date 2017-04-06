<html>
<head>
<script type="text/javascript" src="../js/jquery-3.1.1.js"></script>
<script type="text/javascript">
$(document).ready(function () {
$("#search").click(function () {
$("#load").fadeIn("slow");
});
});
</script>
</head>
<body>
<div id="load" style="display: none;">
<img alt="waiting..." src="../images/log.jpg" />
加载中,请稍等...
</div>
<input id="search" type="button" value="查询" />
</body>
</html>