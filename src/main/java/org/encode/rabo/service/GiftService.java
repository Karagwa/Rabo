package org.encode.rabo.service;

import lombok.RequiredArgsConstructor;
import org.encode.rabo.exception.EntityNotFoundException;
import org.encode.rabo.model.Gift;
import org.encode.rabo.repository.GiftRepository;
import org.encode.rabo.repository.UserRepository;
import org.encode.rabo.repository.WishListRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GiftService {

    private final GiftRepository giftRepository;
    private final UserRepository userRepository;
    private final WishListRepository wishListRepository;

    public Gift readGiftById(String id){
        Optional<Gift> gift= giftRepository.findById(id);
        if (gift.isPresent()){
            return gift.get();
        }
        throw new EntityNotFoundException("Can't find any gift under the given ID");
    }

    public List<Gift> readGifts(){
        return giftRepository.findAll();
    }

    public Gift createGift(G)

}
