// DO NOT EDIT THIS FILE - it is machine generated -*- c++ -*-

#ifndef __org_openss7_javax_jain_protocol_ss7_map_transaction_JainMapMessageTransactionStackImpl__
#define __org_openss7_javax_jain_protocol_ss7_map_transaction_JainMapMessageTransactionStackImpl__

#pragma interface

#include <java/lang/Object.h>

extern "Java"
{
  namespace org
  {
    namespace openss7
    {
      namespace javax
      {
        namespace jain
        {
          namespace protocol
          {
            namespace ss7
            {
              namespace map
              {
                namespace transaction
                {
                  class JainMapMessageTransactionStackImpl;
                }
              }
            }
          }
        }
      }
    }
  }
  namespace javax
  {
    namespace jain
    {
      namespace protocol
      {
        namespace ss7
        {
          namespace map
          {
            namespace transaction
            {
              class MessageTransactionProvider;
            }
          }
        }
      }
    }
  }
}

class org::openss7::javax::jain::protocol::ss7::map::transaction::JainMapMessageTransactionStackImpl : public ::java::lang::Object
{
public:
  virtual ::javax::jain::protocol::ss7::map::transaction::MessageTransactionProvider *createMessageTransactionProvider ();
  virtual void deleteMessageTransactionProvider (::javax::jain::protocol::ss7::map::transaction::MessageTransactionProvider *);
  JainMapMessageTransactionStackImpl ();

  static ::java::lang::Class class$;
};

#endif /* __org_openss7_javax_jain_protocol_ss7_map_transaction_JainMapMessageTransactionStackImpl__ */