#rsync -r --ignore-existing example_dir/ mollyzhang@bop.soe.ucsc.edu:~/example_dir/
#rsync -r example_dir/ mollyzhang@bop.soe.ucsc.edu:~/example_dir/
rsync -r --update --delete example_dir/ mollyzhang@bop.soe.ucsc.edu:~/example_dir/
