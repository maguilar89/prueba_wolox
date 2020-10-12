package com.wolox.prueba.applicacion.mapper;

import com.wolox.prueba.applicacion.dto.AddressDto;
import com.wolox.prueba.applicacion.dto.CompanyDto;
import com.wolox.prueba.applicacion.dto.GeoDto;
import com.wolox.prueba.applicacion.dto.UserDto;
import com.wolox.prueba.domain.model.User;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserAppMapper {

    UserDto dominioADto(User user);

    User dtoADominio(UserDto userDto);

    List<UserDto> domineToDtoList(List<User> users);

    List<User> dtoToDtoList(List<UserDto> users);

    @AfterMapping
    default void setDataDominio(@MappingTarget User user,UserDto userDto){
        user.setStreet(userDto.getAddress().getStreet());
        user.setCity(userDto.getAddress().getCity());
        user.setZipcode(userDto.getAddress().getZipcode());
        user.setLat(userDto.getAddress().getGeo().getLat());
        user.setLng(userDto.getAddress().getGeo().getLng());
        user.setNameCompany(userDto.getCompany().getName());
        user.setCatchPhrase(userDto.getCompany().getCatchPhrase());
        user.setBs(userDto.getCompany().getBs());
    }

    @AfterMapping
    default void setDataDto(@MappingTarget UserDto userDto,User user){
        GeoDto geoDto = new GeoDto();
        geoDto.setLat(user.getLat());
        geoDto.setLng(user.getLng());
        AddressDto addressDto = new AddressDto();
        addressDto.setGeo(geoDto);
        addressDto.setCity(user.getCity());
        addressDto.setStreet(user.getStreet());
        addressDto.setSuite(user.getSuite());
        addressDto.setZipcode(user.getZipcode());
        userDto.setAddress(addressDto);
        CompanyDto companyDto =  new CompanyDto();
        companyDto.setBs(user.getBs());
        companyDto.setCatchPhrase(user.getCatchPhrase());
        companyDto.setName(user.getNameCompany());
        userDto.setCompany(companyDto);

    }


}
