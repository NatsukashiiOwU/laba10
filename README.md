# laba10
![image](https://user-images.githubusercontent.com/38032753/164913448-d94a4bc4-8f44-494d-adb0-2a81f7d935fc.png)

Get from VCS
![image](https://user-images.githubusercontent.com/38032753/164913490-cbd0b865-ccb2-4783-9dd7-9c41f8bd46bb.png)

Импорт делать с Maven иначе зависимости не соберет

![image](https://user-images.githubusercontent.com/38032753/164913563-c02f93d9-fd75-4c27-89ff-faac21d54ae7.png)

В <code>/src/main/resources/application.properties</code> поменять данные от пользователя постграса

![image](https://user-images.githubusercontent.com/38032753/164913709-6a583f42-8d9d-4fcf-ba7b-3beea8cf88a4.png)

Здесь в database выбирайте postgres вписываете данные от бд (путь и данные пользователя)

![image](https://user-images.githubusercontent.com/38032753/164913779-76909f2c-c140-4ced-9a58-deca70caf626.png)
Снизу предложат поставить драйвер (где update)
Url <code>jdbc:postgresql://localhost:5432/postgres</code> сгенерированный ваш вписать в application.properties

![image](https://user-images.githubusercontent.com/38032753/164913885-6b1f1741-5a30-448b-9957-3a2c5cce5161.png)
![image](https://user-images.githubusercontent.com/38032753/164913906-ce92d1fc-b77f-4470-8594-2f6f7751dd4e.png)

В src/main/java/testController оба метода прописаны нужно только поменять функцию f и название фунции в 
<code>float result = Simpson(integralRequest.A,integralRequest.h,integralRequest.B)</code>

Запросы кидать на <code>http://localhost:8080/api/test/integral</code>
