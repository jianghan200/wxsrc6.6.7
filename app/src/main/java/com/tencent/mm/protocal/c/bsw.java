package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bsw
  extends com.tencent.mm.bk.a
{
  public String aAL;
  public String mxA;
  public LinkedList<String> sqo = new LinkedList();
  public String value;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.aAL == null) {
        throw new b("Not all required fields were included: key");
      }
      if (this.value == null) {
        throw new b("Not all required fields were included: value");
      }
      if (this.aAL != null) {
        paramVarArgs.g(1, this.aAL);
      }
      if (this.value != null) {
        paramVarArgs.g(2, this.value);
      }
      if (this.mxA != null) {
        paramVarArgs.g(3, this.mxA);
      }
      paramVarArgs.d(4, 1, this.sqo);
      return 0;
    }
    if (paramInt == 1) {
      if (this.aAL == null) {
        break label408;
      }
    }
    label408:
    for (int i = f.a.a.b.b.a.h(1, this.aAL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.value != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.value);
      }
      i = paramInt;
      if (this.mxA != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.mxA);
      }
      return i + f.a.a.a.c(4, 1, this.sqo);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.sqo.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.aAL == null) {
          throw new b("Not all required fields were included: key");
        }
        if (this.value != null) {
          break;
        }
        throw new b("Not all required fields were included: value");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        bsw localbsw = (bsw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbsw.aAL = locala.vHC.readString();
          return 0;
        case 2: 
          localbsw.value = locala.vHC.readString();
          return 0;
        case 3: 
          localbsw.mxA = locala.vHC.readString();
          return 0;
        }
        localbsw.sqo.add(locala.vHC.readString());
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/bsw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */