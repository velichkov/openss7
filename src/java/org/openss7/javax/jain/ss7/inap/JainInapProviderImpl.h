// DO NOT EDIT THIS FILE - it is machine generated -*- c++ -*-

#ifndef __org_openss7_javax_jain_ss7_inap_JainInapProviderImpl__
#define __org_openss7_javax_jain_ss7_inap_JainInapProviderImpl__

#pragma interface

#include <java/lang/Object.h>
#include <gcj/array.h>

extern "Java"
{
  namespace javax
  {
    namespace jain
    {
      namespace ss7
      {
        namespace inap
        {
          namespace event
          {
            class DialogueReqEvent;
          }
          class JainInapStack;
          class JainInapListener;
        }
      }
    }
  }
  namespace org
  {
    namespace openss7
    {
      namespace javax
      {
        namespace jain
        {
          namespace ss7
          {
            namespace inap
            {
              class JainInapProviderImpl;
              class JainInapStackImpl;
            }
          }
        }
      }
    }
  }
}

class org::openss7::javax::jain::ss7::inap::JainInapProviderImpl : public ::java::lang::Object
{
public:  // actually protected
  JainInapProviderImpl ();
public:
  JainInapProviderImpl (::org::openss7::javax::jain::ss7::inap::JainInapStackImpl *);
  virtual void finalize ();
  virtual void addJainInapListener (::javax::jain::ss7::inap::JainInapListener *, jbyteArray);
  virtual void removeJainInapListener (::javax::jain::ss7::inap::JainInapListener *, jbyteArray);
  virtual ::javax::jain::ss7::inap::JainInapStack *getStack ();
  virtual jint getCallID ();
  virtual jintArray sendInapReqEvent (::javax::jain::ss7::inap::event::DialogueReqEvent *);
private:
  ::org::openss7::javax::jain::ss7::inap::JainInapStackImpl * __attribute__((aligned(__alignof__( ::java::lang::Object )))) m_stack;
public:

  static ::java::lang::Class class$;
};

#endif /* __org_openss7_javax_jain_ss7_inap_JainInapProviderImpl__ */