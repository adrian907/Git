public class Essentials {

	public static void main(String[] args) {

	}
}
//git init : The word init means initialize. The command sets up all the tools Git needs
//to begin tracking changes made to the project.

/*
 *A Git project can be thought of as having three parts:
1) A Working Directory: where you'll be doing all the work: creating, editing,
deleting and organizing files.
2) A Staging Area: where you'll list changes you make to the working directory
3) A Repository: where Git permanently stores those changes as different versions of the project.
 */
//git status: 
//You can check the status of changes with it . In the output, notice the file in red under
//untracked files.Untracked means that Git sees the file but has not started tracking changes yet.

//git add filename1 filename2 filename3
//We can add a file to the staging area with this command.

//git diff filename
//Since the file is tracked, we can check the differences between the working directory
//and the staging area .

//git commit -m "Complete first line of dialogue"
//Typical commit message. Standard Conventions for Commit Messages:
//1)Must be in quotation marks
//2)Written in the present tense
//3)Should be brief (50 characters or less) when using -m . 


//git log
//Commits are stored chronologically in the repository and can be viewed with above command .
//A 40-character code, called a SHA, uniquely identifies the commit. 

//git show HEAD
//The output of this command will display everything the git log command displays for the HEAD
//commit, plus all the file changes that were committed.
//In Git, the commit you are currently on is known as the HEAD commit.
// In many cases, the most recently made commit is the HEAD commit.


//git reset SHA 
//( first seven digits of the SHA code) 
//Allows to come back to a specific commit. 


//git reset HEAD filename
//Unstages file changes in the staging area.


//git checkout HEAD filename
//This command will restore the file in your working directory to look exactly as it did
//when you last made a commit.


//////////////////////////// BRANCHES 
//git branch
//Returns the list of the branches and one with a * - the one you're currently on.

//git checkout branch_name
//Changes branch to branch_name. 

//git merge branch_to_merge
//Merges branch_to_merge with the currently used branch.

//Merge conflict - if you made a commit on master before you merged the two branches, or
//furthermore, when the commit you made on master altered the same exact text you worked on
//in branch_to_merge? When you switch back to master and ask Git to merge the two branches,
//Git doesn't know which changes you want to keep.


//Git uses markings to indicate the HEAD (master) version of the file and the branch_to_merge 
//version of the file, like this:
/*
<<<<<<< HEAD
master version of line
=======
branch_to_merge version of line
>>>>>>> branch_to_merge
*/
//We need to delete every sign added by Git and decide which of the versions to keep
//and which to delete.

//git branch -d branch_name
//Deleting branch .

//git branch branch_name: 
//Creates a new branch


///////////////////////////////REMOTES

//remote -  a shared Git repository that allows multiple collaborators 
//to work on the same Git project from different locations.

//git clone remote_location clone_name
//In order to get your own replica of remote, you can clone it with above command.
// remote_location tells Git where to go to find the remote. This could be a web address,
//or a filepath.
//clone_name is the name you give to the directory into which Git will clone the repository.

//git remote -v
//You can see a list of a Git project's remotes .

//git fetch
//Easy way to see if changes have been made to remote and bring the changes down to your local 
//copy.This command will not merge changes from the remote into your local repository. 
//It brings those changes onto what's called a remote branch.
//Even though Sally's new commits have been fetched to your local copy of the Git project,
//those commits are on the origin/master branch. Your local master branch has not 
//been updated yet, so you can't view or make changes to any of the work she has added.
//To make it possible just merge branches . 

//git push origin your_branch_name
//will push your branch up to the remote, origin. 
/*
A Git project can be thought of as having three parts:

1) A Working Directory: where you'll be doing all the work: creating, editing,
deleting and organizing files.
2) A Staging Area: where you'll list changes you make to the working directory
3) A Repository: where Git permanently stores those changes as different versions of the project.
*/