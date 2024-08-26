# Kafka Example

Пример работы с Kafka в Spring Boot приложении.

`producer` раз в 5 секунд формирует сообщение (ключ - текущие дата время; значение - случайное число в виде строки).

`consumer` читает сообщения и печатает в лог.

Предполагается, что Kafka развернута с использованием репозитория [kafka-compose](https://github.com/pavelvpster/kafka-compose) (пока использовать ветку `develop`).
