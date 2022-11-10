git ls-remote

git remote set-url origin ${https://github.com/AND-DTI/FLW_IMPORT_BACKEND.git}

git remote add api_backend https://github.com/AND-DTI/FLW_IMPORT_BACKEND.git


git config --global user.email "anderson_dasilva@honda.com.br" "AND-DTI"

git config user.name "AND-DTI" git config user.email "anderson_dasilva@honda.com.br" git config --get user.name

git push api_base master

git config --local user.email "anderson_dasilva@honda.com.br" "AND-DTI"

git branch -r



usage: git remote set-url [--push] <name> <newurl> [<oldurl>]
   or: git remote set-url --add <name> <newurl>
   or: git remote set-url --delete <name> <url>

    --push                manipulate push URLs
    --add                 add URL
    --delete              delete URLs