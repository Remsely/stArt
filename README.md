## Онлайн-Студия Дизайна "stArt"

Добро пожаловать в репозиторий сайта онлайн-студии дизайна **"stArt"** – вашего универсального ресурса для обмена знаниями и полезными советами по дизайну интерфейсов. Наш форум является отличным местом для дизайнеров всех уровней, чтобы учиться, делиться и общаться на профессиональные темы.

### Начало работы

Для начала использования нашего сайта, пожалуйста, следуйте инструкциям ниже.

#### Предварительные требования

Перед тем как запустить проект, убедитесь, что на вашем компьютере установлены:

- Java JDK 21
- Yarn (последняя доступная версия)
- Gradle (проверьте совместимость с вашей версией JDK)

#### Установка

1. Клонируйте репозиторий на ваш локальный компьютер:
```shell
git clone https://github.com/Remsely/stArt.git
```

2. Перейдите в директорию backend и выполните команду для сборки бэкенда с помощью Gradle:
```shell
cd back
./gradlew build
```

3. Запустите Spring Boot приложение:
```shell
./gradlew bootRun
```

4. После успешного запуска бэкенда, перейдите в директорию frontend:
```shell
cd ../front
```

5. Установите зависимости для фронтенда:
```shell
yarn install
```

6. Запустите приложение React:
```shell
yarn start
```

После выполнения данных инструкций сайт будет доступен по адресу http://localhost:3000/.

### Использованные технологии

- Gradle – инструмент сборки проекта;
- React – библиотека для построения пользовательского интерфейса;
- Spring Boot – фреймворк для упрощения задач построения и запуска новых приложений;
- Spring Validation – модуль для валидации данных;
- Lombok – инструмент для минимизации шаблонного кода;
- Spring JDBC — модуль для работы с БД с помощью JDBC;
- H2 SQL – встраиваемая база данных для тестирования и разработки;
- React Router – библиотека для маршрутизации в React-приложениях.

### Структура проекта

Проект разделен на две основные части: back и front.

В директории **back** находится код бэкенда приложения, реализованный с использованием Spring Boot.

В директории **front** расположен пользовательский интерфейс, созданный с помощью React.

Мы благодарим вас за интерес к проекту **"stArt"** и надеемся, что наш сайт окажется для вас полезным и информативным ресурсом!
