package org.example.api.mapper;

import org.example.api.dto.AddressDto;
import org.example.api.entity.Address;

public class AddressMapper {
    public static AddressDto toDto(Address address) {
        if (address == null) {
            return null;
        }

        AddressDto dto = new AddressDto();
        dto.setId(address.getId());
        dto.setUserId(address.getUserId());
        dto.setAddressDetail(address.getAddressDetail());
        dto.setName(address.getName());
        dto.setPhone(address.getPhone());
        dto.setStatus(address.isStatus());

        return dto;
    }

    public static Address toEntity(AddressDto dto) {
        if (dto == null) {
            return null;
        }

        Address address = new Address();
        address.setUserId(dto.getUserId());
        address.setAddressDetail(dto.getAddressDetail());
        address.setName(dto.getName());
        address.setPhone(dto.getPhone());
        address.setStatus(dto.isStatus());

        return address;
    }
}
