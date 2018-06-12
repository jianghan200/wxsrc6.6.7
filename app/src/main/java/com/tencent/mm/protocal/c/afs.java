package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class afs
  extends com.tencent.mm.bk.a
{
  public String aem;
  public String hva;
  public LinkedList<String> rJC = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.aem != null) {
        paramVarArgs.g(1, this.aem);
      }
      if (this.hva != null) {
        paramVarArgs.g(2, this.hva);
      }
      paramVarArgs.d(3, 1, this.rJC);
      return 0;
    }
    if (paramInt == 1) {
      if (this.aem == null) {
        break label285;
      }
    }
    label285:
    for (paramInt = f.a.a.b.b.a.h(1, this.aem) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hva != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.hva);
      }
      return i + f.a.a.a.c(3, 1, this.rJC);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rJC.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        afs localafs = (afs)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localafs.aem = locala.vHC.readString();
          return 0;
        case 2: 
          localafs.hva = locala.vHC.readString();
          return 0;
        }
        localafs.rJC.add(locala.vHC.readString());
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/afs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */