const transactionsUl = document.querySelector('#transactions');
const inputTransactionName = document.querySelector('#text');
const inputTransactionAmount = document.querySelector('#amount');
const balanceDisplay = document.querySelector('#balance');
const incomeDisplay = document.querySelector('#money-plus');
const expensesDisplay = document.querySelector('#money-minus');

// objeto ficticio
let dummyTransactions = []

//gerador de id aleatório
const geradorID = () => Math.round(Math.random() * 1000);

const addTransactionInArray = (transactionName, transactionAmount) => {
    dummyTransactions.push({
        id: geradorID(), // AINDA ESTÁ FIXO PQ NÃO TEMOS UM GERADOR DE ID
        name: transactionName,
        amount: Number(transactionAmount)
    })
}

const handleFormSubmit = event => {
    event.preventDefault(); // altera o fluxo padrão do sunmit (troca de tela) para jogar os dados do campo na mesma tela

const isSomeInputEmpty = inputTransactionName.value.trim() === '' || inputTransactionAmount.value.trim() === '';

    if (isSomeInputEmpty) {
        alert('Informe a descrição e o valor da transação');
        return;
    }

    addTransactionInArray(inputTransactionName.value, inputTransactionAmount.value);
    init();
    cleanInputs();
}

const cleanInputs = () =>{
    inputTransactionName.value = '';
    inputTransactionAmount.value = '';
}

form.addEventListener('submit', handleFormSubmit);

const addTransactionDOM = transaction => {
    const li = document.createElement('li')
    // condicao na linha (if - ternário)
    const operator = transaction.amount < 0 ?'-': '+';
    const amountWithoutOperator = Math.abs(transaction.amount);
    const CssClass = transaction.amount < 0 ? 'minus' : 'plus';

    li.innerHTML = `
                ${transaction.id} -> 
                ${transaction.name} 
                <span> ${operator} R$ ${amountWithoutOperator} </span>
                <button class="delete-btn" onClick="removeTransaction(${transaction.id})">X</button> `
    //atribuindo um nó ao li
    transactionsUl.append(li);
}

//metodos que irá separar os valores de total, receitas e despesas
const updateBalanceValues = () => {
    //pega todos os valores (amount) do array
    const transactionsAmounts = dummyTransactions.map(({ amount }) => amount)
    console.log('Somente os valores: ' + transactionsAmounts);

    //totalizador
    const total = transactionsAmounts.reduce((accumulator, transaction) => accumulator + transaction, 0);
    console.log('Soma dos valores: ' + total);

    //somente as receitas
    const income = transactionsAmounts
        .filter(value => value > 0)
        .reduce((accumulator, transaction) => accumulator + transaction, 0);
    console.log('Somente os valores positivos: ' + income);

    //somente as despesas
    const expenses = transactionsAmounts
        .filter(value => value < 0)
        .reduce((accumulator, transaction) => accumulator + transaction, 0);
    console.log('Somente os valores negativos: ' + expenses);

    balanceDisplay.textContent = `R$ ${total}`
    incomeDisplay.textContent = `R$ ${income}`
    expensesDisplay.textContent = `R$ ${expenses}`

}
const removeTransaction = ID => {
    dummyTransactions = dummyTransactions.filter(transaction => transaction.id !== ID);
    console.log(dummyTransactions);
    init();
}

const init = () => {
    // solução a nível de código (gambiarra)
    transactionsUl.innerHTML = '';
    dummyTransactions.forEach(addTransactionDOM);
    updateBalanceValues();
}
// funcao de inicializacao do js
init();