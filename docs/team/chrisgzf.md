---
layout: page
title: Christopher Goh's Project Portfolio Page
---

## Project: TAsker

TAsker is a desktop app for Teaching Assistants (TAs) to manage student administration, optimized for use via a Command Line Interface (CLI). The user interacts with it using a CLI, and it has a GUI created with JavaFX. It is written in Java, and has about 20 kLoC.

Given below are my contributions to the project.

- **New Feature**: Implement the Attendance model

  - What it does: allows the user to save student's class attendance.
  - Justification: This feature is one of the core features of TAsker, attendance tracking. TAs would like to easily be able to keep track of which ones of their classes their students have missed or attended, so that they can easily keep track of their student's progress, as well as assign participation marks (if linked to attendance).
  - Highlights: This enhancement required an in-depth analysis of design alternatives to best store attendance data. After comparing between a few alternatives, we decided that attendance data should be tagged primarily to the students, and hence it guided us in the way we shape our data, in our persisted user data storage. The implementation too was challenging, as it required careful design and treatment to ensure that the Person model's stored Attendance data is the single source of truth, to prevent future potential bugs.
  - Credits: The Jackson library was used to serialize the attendance data into our persisted JSON data storage file.

- **Code contributed**: [RepoSense link](https://nus-cs2103-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=&sort=totalCommits&sortWithin=title&since=2020-08-14&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&tabOpen=true&tabType=authorship&tabAuthor=chrisgzf&tabRepo=AY2021S1-CS2103T-F11-1%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code~other)

- **Project management**:

  - Managed release `v1.3(trial)` on GitHub

- **Enhancements to existing features**:

  - Updated the GUI color scheme (Pull requests [\#59](https://github.com/AY2021S1-CS2103T-F11-1/tp/pull/59))
  - From here on: To be updated.
  - Wrote additional tests for existing features to increase coverage from 88% to 92% (Pull requests [\#36](), [\#38]())

- **Documentation**:

  - User Guide:
    - Added documentation for the features `delete` and `find` [\#72]()
    - Did cosmetic tweaks to existing documentation of features `clear`, `exit`: [\#74]()
  - Developer Guide:
    - Added implementation details of the `delete` feature.

- **Community**:

  - PRs reviewed (with non-trivial review comments): [\#12](), [\#32](), [\#19](), [\#42]()
  - Contributed to forum discussions (examples: [1](https://github.com/nus-cs2103-AY2021S1/forum/issues/52#issuecomment-678835959), [2](https://github.com/nus-cs2103-AY2021S1/forum/issues/172#issuecomment-690681241)
  - Contributed to se-edu's SE Textbook: [\#91](https://github.com/se-edu/se-book/pull/91)
  - Provided suggestions to enhance my classmates' workflow with their IDE: [\#58](https://github.com/nus-cs2103-AY2021S1/forum/issues/58)

- **Tools**:

  - Improved code review workflow by enforcing local CI checks before `git push` with gradle Git Hooks: see [\#88](https://github.com/AY2021S1-CS2103T-F11-1/tp/pull/88)
  - Integrated a new Github plugin (CircleCI) to the team repo
