package in.harshalkhade.apihub.management.controller;

import in.harshalkhade.apihub.management.dto.requestDto.OrganizationRequest;
import in.harshalkhade.apihub.management.dto.requestDto.OrganizationStatusRequest;
import in.harshalkhade.apihub.management.dto.requestDto.TenantAdminRequest;
import in.harshalkhade.apihub.management.dto.responseDto.OrganizationResponse;
import in.harshalkhade.apihub.management.dto.responseDto.TenantAdminResponse;
import in.harshalkhade.apihub.management.service.OrganizationService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/platform/organization")
public class PlatformOrganizationController {

    private OrganizationService organizationService;

    public PlatformOrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    // CRUD -> organization

    // 1. Create

    @PostMapping
    public ResponseEntity<OrganizationResponse> create(
            @Valid @RequestBody OrganizationRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(organizationService.create(request));
    }

    // 2. Read all

    @GetMapping
    public ResponseEntity<List<OrganizationResponse>> findAll() {
        return ResponseEntity.ok(organizationService.findAll());
    }

    // 3. Read one


    @GetMapping("/{id}")
    public ResponseEntity<OrganizationResponse> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(organizationService.findById(id));
    }

    // 4. Update

    @PutMapping("/{id}")
    public ResponseEntity<OrganizationResponse> update(@PathVariable Long id,
                                                       @Valid @RequestBody OrganizationRequest request) {
        return ResponseEntity.ok(organizationService.update(id, request));
    }

    // 5. Patch (ACTIVE , PENDING)

    @PatchMapping("/{id}/status")
    public ResponseEntity<OrganizationResponse> changeStatus(@PathVariable Long id,
                                                             @Valid @RequestBody OrganizationStatusRequest request) {
        return ResponseEntity.ok(organizationService.changeStatus(id, request));
    }

    // 6. Delete (Soft delete)

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        organizationService.delete(id);
        return ResponseEntity.noContent().build();
    }


    // CRUD -> TENANT ADMIN

    @PostMapping("/{organizationId}/tenant-admin")
    public ResponseEntity<TenantAdminResponse> createTenantAdmin(@PathVariable Long organizationId,
                                                                 @Valid @RequestBody TenantAdminRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(organizationService.createTenantAdmin(organizationId, request));
    }

    @GetMapping("/{organizationId}/tenant-admin")
    public ResponseEntity<TenantAdminResponse> getTenantAdmin(@PathVariable Long organizationId) {
        return ResponseEntity.ok(organizationService.getTenantAdmin(organizationId));
    }

    @PutMapping("/{organizationId}/tenant-admin")
    public ResponseEntity<TenantAdminResponse> updateTenantAdmin(@PathVariable Long organizationId,
                                                                 @Valid @RequestBody TenantAdminRequest request) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(organizationService.updateTenantAdmin(organizationId, request));
    }

    @DeleteMapping("/{organizationId}/tenant-admin")
    public ResponseEntity<Void> deleteTenantAdmin(@PathVariable Long organizationId) {
        organizationService.deleteTenantAdmin(organizationId);
        return ResponseEntity.noContent().build();
    }
}
