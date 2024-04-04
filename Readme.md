check status command - git status
check branch command - git branch
switch branch command - git checkout <branch name>
delete branch command - git branch -d <branch name>

add a single file - git add <file-name>
add files to commit - git add .
commit to git branch - git commit -m <"your comments">
push command - git push origin <branch name>




//--------------------------------------------------
Merge Back to Main Branch:
If you want to push your changes back to the main branch, switch to the main branch:
git checkout main

Merge your branch into the main branch:
git merge <your_branch_name>

Push to the Online Repository:
Push your changes to the online repository:
git push

For the first time pushing any branch, use:
git push --set-upstream <repository_url> <your_branch_name>