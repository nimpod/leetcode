var numUniqueEmails = function(emails) {
    var uniqueEmails = new Set();
  
    for (var i = 0; i < emails.length; i++) {
      email = emails[i].split('@');
      localName = email[0];
      domainName = email[1];
  
      localName = localName.replace(/\./g, "");   // remove . symbols
      localName = localName.split('+')[0];        // remove + symbols and everything after it
  
      email = localName + "@" + domainName;
      uniqueEmails.add(email);
    }
    return uniqueEmails.size;
  }