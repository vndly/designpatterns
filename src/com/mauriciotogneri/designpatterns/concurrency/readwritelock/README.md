Read-Write Lock Pattern
=======================

The read-write lock pattern is a design pattern which maintains a pair of associated locks, one for read-only operations and one for writing. The read lock may be held simultaneously by multiple reader threads, so long as there are no writers.