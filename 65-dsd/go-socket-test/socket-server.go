package main

import (
	"fmt"
	"net"
	"os"
)

const (
	ServerHost = "127.0.0.1"
	ServerPort = "8080"
	ServerType = "tcp"
)

func main() {
	fmt.Println("Server Running...")
	server, err := net.Listen(ServerType, ServerHost+":"+ServerPort)
	if err != nil {
		fmt.Println("Error listening:", err.Error())
		os.Exit(1)
	}

	defer func(server net.Listener) {
		err := server.Close()
		if err != nil {

		}
	}(server)

	fmt.Println("Listening on " + ServerHost + ":" + ServerPort)
	fmt.Println("Waiting for client...")

	for {
		connection, err := server.Accept()
		if err != nil {
			fmt.Println("Error accepting: ", err.Error())
			os.Exit(1)
		}
		fmt.Println("Client connected");
		go processClient(connection)
	}
}

func processClient(connection net.Conn) {
	buffer := make([]byte, 1024)
	mLen, err := connection.Read(buffer)
	if err != nil {
		fmt.Println("Error reading: ", err.Error())
	}
	fmt.Println("Received: ", string(buffer[:mLen]))
	_, err = connection.Write([]byte("Thanks! Got your message: " + string(buffer[:mLen])))
	err = connection.Close()
	if err != nil {
		return
	}
}
