package com.example.demo;


import com.example.demo.Repo.LocationRepo;
import org.springframework.stereotype.Service;


@Service
public class Server {
    final LocationRepo repo;

    public Server(LocationRepo repo) {
        this.repo = repo;
    }

    public void start() {
        while (true) {
            System.out.println("Hello");
        }
    }
}
