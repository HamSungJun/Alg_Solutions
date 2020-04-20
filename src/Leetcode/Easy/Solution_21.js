function ListNode(val) {
  this.val = val;
  this.next = null;
}

function add(list, node) {
  while (list.next !== null) {
    list = list.next;
  }
  list.next = node;
}

var mergeTwoLists = function(l1, l2) {
  let mergedList = new ListNode(null);

  while (l1 !== null && l2 !== null) {
    const l1Val = l1.val;
    const l2Val = l2.val;

    if (l1Val < l2Val) {
      let nodel1 = new ListNode(l1Val);
      add(mergedList, nodel1);
      l1 = l1.next;
    } else if (l1Val > l2Val) {
      let nodel2 = new ListNode(l2Val);
      add(mergedList, nodel2);
      l2 = l2.next;
    } else if (l1Val === l2Val) {
      let nodel1l2 = new ListNode(l1Val);
      nodel1l2.next = new ListNode(l2Val);
      add(mergedList, nodel1l2);

      l1 = l1.next;
      l2 = l2.next;
    }
  }

  if (l1 !== null) {
    while (l1 !== null) {
      let nodel1 = new ListNode(l1.val);
      add(mergedList, nodel1);

      l1 = l1.next;
    }
  }

  if (l2 !== null) {
    while (l2 !== null) {
      let nodel2 = new ListNode(l2.val);
      add(mergedList, nodel2);
      l2 = l2.next;
    }
  }

  return mergedList.next;
};
