package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class lt
  extends bhp
{
  public int myh;
  public String myi;
  public String myj;
  public String plj;
  public LinkedList<atm> rpN = new LinkedList();
  public atm rpO;
  public String rpP;
  public boolean rpQ;
  public String rpR;
  public int rpS;
  public att rpT;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.url == null) {
        throw new b("Not all required fields were included: url");
      }
      if (this.rpO == null) {
        throw new b("Not all required fields were included: bottom_item");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.url != null) {
        paramVarArgs.g(2, this.url);
      }
      paramVarArgs.d(3, 8, this.rpN);
      if (this.rpO != null)
      {
        paramVarArgs.fV(4, this.rpO.boi());
        this.rpO.a(paramVarArgs);
      }
      if (this.plj != null) {
        paramVarArgs.g(5, this.plj);
      }
      if (this.rpP != null) {
        paramVarArgs.g(6, this.rpP);
      }
      paramVarArgs.av(7, this.rpQ);
      paramVarArgs.fT(8, this.myh);
      if (this.rpR != null) {
        paramVarArgs.g(9, this.rpR);
      }
      if (this.myi != null) {
        paramVarArgs.g(10, this.myi);
      }
      if (this.myj != null) {
        paramVarArgs.g(11, this.myj);
      }
      paramVarArgs.fT(12, this.rpS);
      if (this.rpT != null)
      {
        paramVarArgs.fV(13, this.rpT.boi());
        this.rpT.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1256;
      }
    }
    label1256:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.url != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.url);
      }
      i += f.a.a.a.c(3, 8, this.rpN);
      paramInt = i;
      if (this.rpO != null) {
        paramInt = i + f.a.a.a.fS(4, this.rpO.boi());
      }
      i = paramInt;
      if (this.plj != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.plj);
      }
      paramInt = i;
      if (this.rpP != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rpP);
      }
      i = paramInt + (f.a.a.b.b.a.ec(7) + 1) + f.a.a.a.fQ(8, this.myh);
      paramInt = i;
      if (this.rpR != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rpR);
      }
      i = paramInt;
      if (this.myi != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.myi);
      }
      paramInt = i;
      if (this.myj != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.myj);
      }
      i = paramInt + f.a.a.a.fQ(12, this.rpS);
      paramInt = i;
      if (this.rpT != null) {
        paramInt = i + f.a.a.a.fS(13, this.rpT.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rpN.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.url == null) {
          throw new b("Not all required fields were included: url");
        }
        if (this.rpO != null) {
          break;
        }
        throw new b("Not all required fields were included: bottom_item");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        lt locallt = (lt)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
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
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            locallt.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          locallt.url = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new atm();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((atm)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            locallt.rpN.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new atm();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((atm)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            locallt.rpO = ((atm)localObject1);
            paramInt += 1;
          }
        case 5: 
          locallt.plj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          locallt.rpP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          locallt.rpQ = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 8: 
          locallt.myh = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          locallt.rpR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          locallt.myi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          locallt.myj = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          locallt.rpS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new att();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((att)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          locallt.rpT = ((att)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/lt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */