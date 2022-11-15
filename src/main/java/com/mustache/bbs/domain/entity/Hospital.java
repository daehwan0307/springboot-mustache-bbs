package com.mustache.bbs.domain.entity;

import com.mustache.bbs.domain.dto.HospitalResponse;
import com.mustache.bbs.domain.dto.HospitalShowDto;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "nation_wide_hospitals")
@Data
public class Hospital {
    @Id
    private Integer id;                         // 번호(PK)

    private String openServiceName;         // 개방 서비스명
    private Integer openLocalGovernmentCode;    // 개방 자치 단체 코드
    private String managementNumber;        // 관리 번호
    private LocalDateTime licenseDate;      // 인/허가 일자
    private Integer businessStatus;             // 영업 상태 구분 => 1:영업, 2:휴업, 3:폐업, 4:취소/말소
    private Integer businessStatusCode;         // 상세 영업 상태 코드 => 13:영업중, 2:휴업, 3:폐업
    private String phone;                   // 소재지 전화 번호
    private String fullAddress;             // 소재지 전체 주소
    private String roadNameAddress;         // 도로명 전체 주소
    private String hospitalName;            // 사업장 이름
    private String businessTypeName;        // 업태 구분명
    private Integer healthcareProviderCount;    // 의료인 수
    private Integer patientRoomCount;           // 입원실 수
    private Integer totalNumberOfBeds;          // 병상 수
    private Float totalAreaSize;            // 총 면적

    public HospitalShowDto toDto() {
        String businessStatusCodeString;
        if(this.businessStatusCode == 13) {
            businessStatusCodeString = "영업중";
        } else if(this.businessStatusCode == 2) {
            businessStatusCodeString = "휴업";
        } else if(this.businessStatusCode == 3) {
            businessStatusCodeString = "폐업";
        } else {
            businessStatusCodeString = "기타";
        }

        return new HospitalShowDto(id, hospitalName, businessTypeName, businessStatusCodeString, roadNameAddress, phone, totalAreaSize);
    }
    public static HospitalResponse of(Hospital hospital) {
        return new HospitalResponse(hospital.getId(),
                hospital.getRoadNameAddress(), hospital.getHospitalName(),
                hospital.getPatientRoomCount(), hospital.getTotalNumberOfBeds(), hospital.getBusinessTypeName(),
                hospital.getTotalAreaSize());
    }
}
