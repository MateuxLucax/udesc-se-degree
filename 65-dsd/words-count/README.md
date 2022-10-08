### Words counter

### Arguments:

1. words dataset folder (string) - [example](https://udesc-my.sharepoint.com/personal/03999436921_udesc_br/_layouts/15/onedrive.aspx?id=%2Fpersonal%2F03999436921%5Fudesc%5Fbr%2FDocuments%2Fceavi%2Fensino%2F2019%2D1%2F65dsd%2Faulas%2F2%2Dprocessos%2Dthreads%2Fexercicios%2FCasosTestePalavrasArquivos%2Ezip&parent=%2Fpersonal%2F03999436921%5Fudesc%5Fbr%2FDocuments%2Fceavi%2Fensino%2F2019%2D1%2F65dsd%2Faulas%2F2%2Dprocessos%2Dthreads%2Fexercicios&ga=1)
2. word to search (string)
3. number of threads (number)
4. number of runs (number)
5. save logs to file (boolean)

How to run:

```bash
java src/Application.java dataset hello 250 5 false
```

If you wish, you can use the following script to run multiple executions to extract results.
```bash
chmod +x run.sh
```
```bash
./run.sh
```
