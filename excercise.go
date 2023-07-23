/*
package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	var J int
	var A int
	//var match int
	//fmt.Scanln(&J)
	//fmt.Scanln(&A)
	J, _ = strconv.Atoi(scanner.Text())
	A, _ = strconv.Atoi(scanner.Text())
	fmt.Println(J, A)
	var js []string = make([]string, J)
	//var as []string = make([]string, A)
	//var an []int = make([]int, A)
	for i := 0; i < J; i++ {
		js[i] = scanner.Text()
	}
	for i, v := range js {
		fmt.Println(i, v)
	}

		for i := 0; i < A; i++ {
			fmt.Scan(&as[i], an[i])
		}
		for i := 0; i < A; i++ {
			if js[an[i]-1] <= as[i] {
				js[an[i]-1] = 'X'
				match++
			}
		}
		fmt.Println(match)

}
*/
/*
package main

import (
"fmt"
"bufio"
"os"
"strconv"
"strings"
)

func main() {
reader := bufio.NewReader(os.Stdin)

fmt.Print("Enter numbers separated by space: ")
input, _ := reader.ReadString('\n')

// Trim the newline character and split the string into substrings
substrings := strings.Split(strings.TrimSpace(input), " ")

// Initialize an int array
numbers := make([]int, len(substrings))

// Convert each substring to an int and store it in the array
for i, s := range substrings {
num, err := strconv.Atoi(s)
if err != nil {
fmt.Println("Invalid input:", s)
os.Exit(1)
}
numbers[i] = num
}

// Print the int array
fmt.Println(numbers)
}

=======================================================
*/
package main

import (
"fmt"
"bufio"
"os"
"strconv"
)

func main() {
scanner := bufio.NewScanner(os.Stdin)

var numbers []int

fmt.Println("Enter numbers, one per line. An empty line to finish:")

for scanner.Scan() {
line := scanner.Text()

// If the line is empty, break the loop
if line == "" {
break
}

// Convert the line to an int
num, err := strconv.Atoi(line)
if err != nil {
fmt.Println("Invalid input:", line)
os.Exit(1)
}

// Append the number to the slice
numbers = append(numbers, num)
}

// Print the numbers
fmt.Println(numbers)
}
//*/
