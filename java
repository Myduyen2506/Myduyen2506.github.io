<!DOCTYPE html>
<html>
       <head>
        <style> 
              #demo{background:rgb(0, 255, 64);height:200px;width:300px;font-size:30px}
              </style>
        <script>
          function myFunction() {
            document.getElementById("demo").innerHTML = "Nội dung thay đổi.";
          }
        </script>              
       </head>
       <body>
        <h1>Đoạn mã JavaScript được đặt trong head</h1>
        <script>
          function myFunction() {
            document.getElementById("demo").innerHTML = "Nội dung thay đổi.";
          }
        </script>
        <p id="demo">Hello</p>
        <button type="button" onclick="myFunction()">Hiển thị</button>            
       </body>
</html>
