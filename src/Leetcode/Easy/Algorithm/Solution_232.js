/**
 * Initialize your data structure here.
 */
var MyQueue = function () {
  this.Queue = [];
};

/**
 * Push element x to the back of queue.
 * @param {number} x
 * @return {void}
 */
MyQueue.prototype.push = function (x) {
  if (this.empty()) {
    this.front = this.Queue[0];
  }
  this.Queue.push(x);
};

/**
 * Removes the element from in front of queue and returns that element.
 * @return {number}
 */
MyQueue.prototype.pop = function () {
  if (this.empty()) {
    throw new Error("Empty Queue");
  }
  return this.Queue.shift();
};

/**
 * Get the front element.
 * @return {number}
 */
MyQueue.prototype.peek = function () {
  if (this.empty()) {
    return -1;
  }
  return this.Queue[0];
};

/**
 * Returns whether the queue is empty.
 * @return {boolean}
 */
MyQueue.prototype.empty = function () {
  return this.Queue.length === 0;
};
