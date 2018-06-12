package d.a.a;

import java.util.LinkedList;

public final class a
  extends com.tencent.mm.bk.a
{
  public String rJm;
  public String url;
  public String vGR;
  public String vGS;
  public int vGT;
  public f vGU;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.vGR != null) {
        paramVarArgs.g(1, this.vGR);
      }
      if (this.vGS != null) {
        paramVarArgs.g(2, this.vGS);
      }
      paramVarArgs.fT(3, this.vGT);
      if (this.url != null) {
        paramVarArgs.g(4, this.url);
      }
      if (this.vGU != null)
      {
        paramVarArgs.fV(5, this.vGU.boi());
        this.vGU.a(paramVarArgs);
      }
      if (this.rJm != null) {
        paramVarArgs.g(6, this.rJm);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.vGR == null) {
        break label532;
      }
    }
    label532:
    for (paramInt = f.a.a.b.b.a.h(1, this.vGR) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.vGS != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.vGS);
      }
      i += f.a.a.a.fQ(3, this.vGT);
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.url);
      }
      i = paramInt;
      if (this.vGU != null) {
        i = paramInt + f.a.a.a.fS(5, this.vGU.boi());
      }
      paramInt = i;
      if (this.rJm != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rJm);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        a locala = (a)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          locala.vGR = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          locala.vGS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          locala.vGT = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          locala.url = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new f();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((f)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locala.vGU = ((f)localObject1);
            paramInt += 1;
          }
        }
        locala.rJm = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/d/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */