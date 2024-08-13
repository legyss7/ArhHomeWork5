package org.lesson5;

import java.util.Scanner;

public class Program {
    /**
     * Необходимо разделить на горизонтальные уровни "Редактор 3D графики".
     * Один пользователь. Программа работает на одном компьютере без выхода
     * в сеть.
     * Что видет пользователь, как взаимодействует? (Панель загруки, блок
     * редактирования, блок просмотра).
     * Какаие задачи можно делать - функции системы? (Загрузить 3D модель,
     * рассмотерть 3D модель, создать новую, редактировать вершины, текстуру,
     * сделать рендер, сохранить рендер).
     * Какие и где хранияться данные? (файлы 3D моделей, рендеры, анимация...,
     * в файловой системе компьютера).
     * Предложить варианты связывания всех уровней - сценариии использования.
     * 3-4 сценария.
     * Сквозная функция - создать новую 3D модель, сделать рендер для печати
     * на принтере...
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Editor3D editor3D = new Editor3D();
        boolean f = true;
        while (f) {
            System.out.println("*** МОЙ 3D РАДАКТОР ***");
            System.out.println("=======================");
            System.out.println("1. Открыть проект");
            System.out.println("2. Сохранить проетк");
            System.out.println("3. Отобразить параметры проекта");
            System.out.println("4. Отобразить все модели проекта");
            System.out.println("5. Отобразить все техтуры проекта");
            System.out.println("6. Выполнить рендер всех моделей");
            System.out.println("7. Выполгнить рендер модели");
            System.out.println("0. ЗАВЕРШЕНИЕ РАБОТЫ ПРИЛОЖЕНИЯ");
            System.out.print("Пожалуйста, выберите пункт меню: ");

            if (scanner.hasNextInt()) {
                int no = scanner.nextInt();
                scanner.nextLine();
                try {
                    switch (no) {
                        case 0:
                            System.out.println("Завершение работы приложения");
                            f = false;
                            break;
                        case 1:
                            System.out.println("Укажите наименование файла проекта: ");
                            String fileName = scanner.nextLine();
                            editor3D.openProject(fileName);
                            System.out.println("Проект успешно открыт.");
                            break;
                        case 3:
                            editor3D.showProjectSettings();
                            break;
                        case 4:
                            editor3D.printAllModels();
                            break;
                        case 5:
                            editor3D.printAllTextures();
                            break;
                        case 6:
                            editor3D.renderAll();
                            break;
                        case 7:
                            System.out.print("Укажите номер модели: ");
                            if (scanner.hasNextInt()) {
                                int modelNo = scanner.nextInt();
                                scanner.nextLine();
                                editor3D.renderModel(modelNo);
                            } else {
                                System.out.println("Номер модели указан некорректно.");
                            }
                            break;
                        default:
                            System.out.println("Укажите корректный пункт меню.");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
