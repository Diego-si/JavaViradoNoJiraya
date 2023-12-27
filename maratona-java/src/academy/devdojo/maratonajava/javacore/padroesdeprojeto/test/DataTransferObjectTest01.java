package academy.devdojo.maratonajava.javacore.padroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder.builder()
                .firstName("De")
                .lastName("ss")
                .build();
        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();
        System.out.println(reportDto);
    }
}
