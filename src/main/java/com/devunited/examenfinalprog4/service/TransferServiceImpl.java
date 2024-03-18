package com.devunited.examenfinalprog4.service;

import com.devunited.examenfinalprog4.model.Transfers;
import com.devunited.examenfinalprog4.repository.TransferRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransferServiceImpl implements TransferService {

    private final TransferRepository transferRepository;

    @Override
    public List<Transfers> getAllTransfers() throws SQLException {
        return transferRepository.getAllTransfers();
    }

    @Override
    public Transfers getTransferById(String id) throws SQLException {
        return transferRepository.getTransferById(id);
    }

    @Override
    public Transfers createTransfer(Transfers transfer) throws SQLException {
        return transferRepository.createTransfer(transfer);
    }

    @Override
    public Transfers updateTransfer(String id, Transfers transfer) throws SQLException {
        return transferRepository.updateTransfer(id, transfer);
    }
}