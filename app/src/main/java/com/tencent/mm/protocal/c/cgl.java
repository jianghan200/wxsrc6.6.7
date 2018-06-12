package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cgl
  extends bhp
{
  public String bKg;
  public String bRK;
  public int sAG;
  public int sAH;
  public int seJ;
  public String url;
  public int version;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.url != null) {
        paramVarArgs.g(2, this.url);
      }
      if (this.bKg != null) {
        paramVarArgs.g(3, this.bKg);
      }
      paramVarArgs.fT(4, this.version);
      paramVarArgs.fT(5, this.sAG);
      paramVarArgs.fT(6, this.seJ);
      paramVarArgs.fT(7, this.sAH);
      if (this.bRK != null) {
        paramVarArgs.g(8, this.bRK);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label626;
      }
    }
    label626:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.url);
      }
      i = paramInt;
      if (this.bKg != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bKg);
      }
      i = i + f.a.a.a.fQ(4, this.version) + f.a.a.a.fQ(5, this.sAG) + f.a.a.a.fQ(6, this.seJ) + f.a.a.a.fQ(7, this.sAH);
      paramInt = i;
      if (this.bRK != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.bRK);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cgl localcgl = (cgl)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localcgl.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcgl.url = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localcgl.bKg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localcgl.version = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localcgl.sAG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localcgl.seJ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localcgl.sAH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localcgl.bRK = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/cgl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */