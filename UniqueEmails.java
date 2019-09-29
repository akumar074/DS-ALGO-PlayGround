package com.demo.learning.easy;

import java.util.HashSet;

class UniqueEmails {
    public int numUniqueEmails(String[] emails) {
        HashSet uniqueEmailSet = new HashSet<String>();
        for (String email : emails) {
            String localName = email.substring(0, email.indexOf('@'));
            String domainName = email.substring(email.indexOf('@'));
            if (localName.indexOf('.') > -1) {
                localName = localName.replace(".", "");
            }
            if (localName.indexOf('+') > -1) {
                localName = localName.substring(0, localName.indexOf('+'));
            }
            uniqueEmailSet.add(localName + domainName);
        }
        return uniqueEmailSet.size();
    }

    public static void main(String[] args) {
        UniqueEmails uniqueEmails = new UniqueEmails();
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(uniqueEmails.numUniqueEmails(emails));
    }
}