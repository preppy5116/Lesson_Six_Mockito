# Lesson_Six_Mockito
**Что означает аннотация  Before?**
>Аннотация @Before обозначает методы, которые будут вызваны перед исполнением тестов. Методы должны быть public void. Здесь обычно размещаются предустановки для теста.

**Как в тесте проверить, что метод должен бросить исключение?**
>assertThrow(throw.class, метод который бросает исключение)

**Что такое mock? Spy?**
>Mockito позволяет создать одной строчкой кода так называемый mock (что-то вроде основы для нужной заглушки) любого класса.
Для такого mock сразу после создания характерно некое поведение по умолчанию (все методы возвращают заранее известные значения — обычно это null либо 0). Можно переопределить это поведение желаемым образом, проконтролировать с нужной степенью детальности обращения к ним так далее.Аннотация @Spy используется для обертывания реальных объектов и добавления механизма отслеживания вызовов их методов и инициализации значений. 

**Для чего применяется статический метод  Mockito.verify?**
>Чтобы убедиться в том, что тестируемый класс вызывает методы этих объектов нужное число раз, в нужном порядке и с нужными параметрами

