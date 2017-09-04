package com.sample.validation.annotationImpl;

import com.sample.validation.annotation.UploadFileNotEmpty;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UploadFileNotEmptyValidator implements ConstraintValidator<UploadFileNotEmpty, MultipartFile> {
    @Override
    public void initialize(UploadFileNotEmpty constraintAnnotation) {

    }

    @Override
    public boolean isValid(MultipartFile multipartFile, ConstraintValidatorContext context) {

        return multipartFile != null &&
                StringUtils.hasLength(multipartFile.getOriginalFilename());
    }
}
