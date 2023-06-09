package ru.skypro.homework.services;

import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dtos.AdsDto;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface AdsService {

    public Iterable<AdsDto> getAllAds();

    public AdsDto addAd(AdsDto adsDto, MultipartFile image) throws IOException;

    public Optional<AdsDto> getAds(Long id);

    public boolean removeAd(Long id);

    public AdsDto updateAds(AdsDto adsDto, Long id);

    public Collection<AdsDto> getMe(String email);

    public byte[] updateImage(Long id, MultipartFile image) throws IOException;

}
