# Kafka Example

Пример работы с Kafka в Spring Boot приложении.

`producer` раз в 5 секунд формирует сообщение (ключ - текущие дата время; значение - случайное число в виде строки).

`consumer` читает сообщения и печатает в лог.

Предполагается, что Kafka развернута с использованием репозитория [kafka-compose](https://github.com/pavelvpster/kafka-compose) (пока использовать ветку `develop`).


## License

Copyright (C) 2024 Pavel Prokhorov (pavelvpster@gmail.com)


This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
